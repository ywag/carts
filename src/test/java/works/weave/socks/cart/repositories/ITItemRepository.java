package works.weave.socks.cart.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import works.weave.socks.cart.entities.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration
public class ITItemRepository {
    @Autowired
    private ItemRepository itemRepository;

    @BeforeEach
    public void removeAllData() {
        itemRepository.deleteAll();
    }

    @Test
    public void testCustomerSave() {
        Item original = new Item("id", "itemId", 1, 0.99F);
        Item saved = itemRepository.save(original);

        assertEquals(1, itemRepository.count());
        assertEquals(original, saved);
    }
}
