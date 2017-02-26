package com.aman.hack.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import com.aman.hack.model.OrderItem;
import com.aman.hack.model.OrderTable;
import com.aman.hack.service.OrderTableService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {
    @Autowired
    private OrderTableService orderTableService;

    @RequestMapping(value = "/api/orderTable/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderTable> getOrderTable(@PathVariable("id")long id) {
        OrderTable orderTable = orderTableService.findOne(id);
        return new ResponseEntity<OrderTable>(orderTable, HttpStatus.OK);
    }

//    @RequestMapping(value = "/api/orderTable/item/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<Item>> getOrderTableItem(@PathVariable("id")long id) {
//        List<Item> items = orderTableService.findItem(id);
//        return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
//    }

    @RequestMapping(value = "/api/orderCost/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCost(@PathVariable("id")long id) {
 //       OrderTable savedPartner = orderTableService.create(orderTable);
        return readJsonFromUrl().toString();
    }

    @RequestMapping(value = "/api/orderTable", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderTable> createOrderTable(@RequestBody OrderTable orderTable) {
        OrderTable savedOrderItem = orderTableService.create(orderTable);
        return new ResponseEntity<OrderTable>(savedOrderItem, HttpStatus.CREATED);
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl()  {
        String url = "http://192.168.99.100:8081/api/findcost?length=10&breadth=15&height=20&distance=25&weight=30";
        InputStream is = null;
        try {
            is = new URL(url).openStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        }
        catch (Exception e){}
        finally {
            try {
                is.close();
            }catch (Exception e){}
        }
        return null;
    }

}