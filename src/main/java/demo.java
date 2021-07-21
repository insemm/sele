import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;

public class demo {
    public static void main(String[] args) throws AWTException {

        String bb3070Link1 = "https://www.bestbuy.com/site/evga-geforce-rtx-3070-xc3-ultra-gaming-8gb-gddr6-pci-express-4-0-graphics-card/6439299.p?skuId=6439299";
        String bb3070Link2 = "https://www.bestbuy.com/site/msi-nvidia-geforce-rtx-3070-ventus-3x-oc-bv-8gb-gddr6-pci-express-4-0-graphics-card/6438278.p?skuId=6438278";
        String bb3070Link3 = "https://www.bestbuy.com/site/gigabyte-nvidia-geforce-rtx-3070-aorus-master-8gb-gddr6-pci-express-4-0-graphics-card/6439384.p?skuId=6439384";
        String bb3070Link4 = "https://www.bestbuy.com/site/evga-nvidia-geforce-rtx-3070-ti-ftw3-ultra-gaming-8gb-gddr6x-pci-express-4-0-graphics-card/6467285.p?skuId=6467285";

        String bb3060Link1 = "https://www.bestbuy.com/site/evga-nvidia-geforce-rtx-3060-xc-gaming-12gb-gddr6-pci-express-4-0-graphics-card/6454329.p?skuId=6454329";
        String bb3060Link2 = "https://www.bestbuy.com/site/asus-tuf-gaming-nvidia-geforce-rtx-3060-12gb-gddr6-pci-express-4-0-graphics-card-black/6460666.p?skuId=6460666";
        String bb3060Link3 = "https://www.bestbuy.com/site/msi-nvidia-geforce-rtx-3060-ventus-2x-12g-oc-12gb-gddr6-pci-express-4-0-graphics-card-black/6462173.p?skuId=6462173";
        String bb3060Link4 = "https://www.bestbuy.com/site/msi-nvidia-geforce-rtx-3060-ventus-3x-12g-oc-12gb-gddr6-pci-express-4-0-graphics-card-black/6452940.p?skuId=6452940";
        String bb3060Link5 = "https://www.bestbuy.com/site/gigabyte-nvidia-geforce-rtx-3060-12gb-gddr6-pci-express-4-0-graphics-card/6468931.p?skuId=6468931";
        String bb3060Link6 = "https://www.bestbuy.com/site/gigabyte-nvidia-geforce-rtx-3060-12gb-gddr6-pci-express-4-0-graphics-card/6468910.p?skuId=6468910";

        String bb3080Link1 = "https://www.bestbuy.com/site/evga-geforce-rtx-3080-xc3-ultra-gaming-10gb-gddr6-pci-express-4-0-graphics-card/6432400.p?skuId=6432400";
        String bb3080Link2 = "https://www.bestbuy.com/site/evga-nvidia-geforce-rtx-3080-ti-ftw3-ultra-gaming-12gb-gddr6x-pci-express-4-0-graphics-card/6467808.p?skuId=6467808";

        ArrayList<String> list = new ArrayList<>();
        list.add(bb3070Link1);
        list.add(bb3070Link2);
        list.add(bb3070Link3);
        list.add(bb3070Link4);
        list.add(bb3060Link1);
        list.add(bb3060Link2);
        list.add(bb3060Link3);
        list.add(bb3060Link4);
        list.add(bb3060Link5);
        list.add(bb3060Link6);

        System.setProperty("webdriver.edge.driver", "C:\\Users\\insem'\\Desktop\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        while (true) {
            for (String i : list) {
                driver.get(i);
                String status = driver.findElement(By.className("add-to-cart-button")).getAttribute("data-button-state");
                if (status.equals("ADD_TO_CART")) {
                    driver.findElement(By.className("add-to-cart-button")).click();
                }
            }
        }
    }
}

