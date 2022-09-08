package repo;

import model.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderSystem {

    private Map<Integer, Menu> menus = new HashMap<>();

    public OrderSystem() {

    }

    public Map<Integer, Menu> getAllMenus() {
        return this.menus;
    }

    public Menu addMenu(Integer number, Menu menu) {
       return menus.put(menu.getNumber(), menu);
    }

    public Menu placeOrder(Integer number) {
        return menus.get(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderSystem that = (OrderSystem) o;
        return Objects.equals(menus, that.menus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menus);
    }

    @Override
    public String toString() {
        return "OrderSystem{" +
                "menus=" + menus +
                '}';
    }
}
