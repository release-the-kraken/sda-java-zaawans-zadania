package Day1.Exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StorageTest {
    private Storage storage;
    @BeforeEach
    void init(){
        storage = new Storage();
    }
    @Test
    void shouldAddNewEntryToStorage() {
        //when
        storage.addToStorage("store1", "jabłko");
        //then
        assertThat(storage.getValues("store1")).containsExactly("jabłko");
    }
    @Test
    void shouldAddNewValueToEntryInStorage() {
        //when
        storage.addToStorage("store1", "jabłko");
        storage.addToStorage("store1", "gruszka");

        //then
        assertThat(storage.getValues("store1")).containsExactly("jabłko", "gruszka");
    }

    @Test
    void shouldReturnKeysForMatchingValues() {
        //when
        storage.addToStorage("store1", "jabłko");
        storage.addToStorage("store1", "gruszka");
        storage.addToStorage("store2", "gruszka");
        //then
        List<String> testList = storage.findValues("gruszka");
        //assertThat(testList.size()).isEqualTo(2);
        assertThat(testList).containsExactly("store1", "store2");

    }
}