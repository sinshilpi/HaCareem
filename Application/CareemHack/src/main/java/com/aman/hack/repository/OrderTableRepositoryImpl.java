package com.aman.hack.repository;

import com.aman.hack.model.Item;
import com.aman.hack.model.OrderItem;
import com.aman.hack.model.OrderTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.aman.hack.service.ItemService;


@Repository
public abstract class OrderTableRepositoryImpl implements OrderTableRepository {
//    private static final String SEARCH_ORDERITEM_ENTRIES = "SELECT I.item_id FROM OrderItem OI " +
//            "WHERE OI.order_id =  :orderid";
//
//    private final NamedParameterJdbcTemplate jdbcTemplate;
//    @Autowired
//    private ItemService itemService;
//
//    @Autowired
//    OrderTableRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

//    @Transactional(readOnly = true)
//    @Override
//    public List<Item> findItems(long orderid) {
//        Map<String, Long> queryParams = new HashMap();
//        queryParams.put("orderid", orderid);
//
//        List<OrderItem> searchResults = jdbcTemplate.query(SEARCH_ORDERITEM_ENTRIES,
//                queryParams,
//                new BeanPropertyRowMapper(OrderItem.class)
//        );
//        List<Item> items = new ArrayList<Item>();
//        for(int i = 0; i < searchResults.size(); i++) {
//            items.add(itemService.findOne(searchResults.get(i).getItemId().getId()));
//        }
//        System.out.println(items);
//        return items;
//
//    }


}
