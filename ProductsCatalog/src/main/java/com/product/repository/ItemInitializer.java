
package com.product.repository;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.product.module.Item;


@Component

class ItemInitializer implements CommandLineRunner {

    private final ItemRepository itemRepository;

    ItemInitializer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("", "Yves Saint Laurent", "Gormani", "Tom Ford", "Estee Lauder", "Lancome", "Sephora")
                .forEach(item -> itemRepository.save(new Item(item)));

        itemRepository.findAll().forEach(System.out::println);
    }
}