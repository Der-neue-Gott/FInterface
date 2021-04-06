import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Web> servers = new ArrayList<>();
            servers.add(new Web(Domain.RU, Country.RUSSIA, 180, 30));
            servers.add(new Web(Domain.NET, Country.BRITAIN, 240, 25));
            servers.add(new Web(Domain.SU, Country.USA, 520, 40));
            servers.add(new Web(Domain.UA, Country.CHINA, 120, 52));
            servers.add(new Web(Domain.RU, Country.CHINA, 135, 30));
            servers.add(new Web(Domain.SU, Country.USA, 310, 35));
            servers.add(new Web(Domain.NET, Country.USA, 450, 60));
            servers.add(new Web(Domain.UA, Country.RUSSIA, 150, 20));
            servers.add(new Web(Domain.NET, Country.BRITAIN, 260, 40));
            servers.add(new Web(Domain.RU, Country.CHINA, 100, 10));


        System.out.println("Нужен качественный недорогой домен со средним количеством памяти, но здесь много лишнего:");
            servers.forEach(System.out::println);
            System.out.println("------------------------");

        System.out.print("Введите тип сортировки из доступных [Country | Price | Storage]: ");
            String sortType = scan.nextLine();


        switch (sortType) {
            case "Country":

                Filterable country = web -> {
                    switch (web.getCountry()) {
                        case RUSSIA:
                        case USA:
                        case BRITAIN: return true;
                        case CHINA: return false;
                    }
                    return false;
                };
                servers.forEach(web -> System.out.println(country.filter(web)) );
            break;

            case "Price":
                Filterable price = web -> web.getPrice() > 240;
                servers.forEach(web -> System.out.println(price.filter(web)) );
            break;

            case "Storage":
                Filterable storage = web -> web.getStorage() <= 30 && web.getStorage() >= 50;
                servers.forEach(web -> System.out.println(storage.filter(web)) );
            break;

            default: System.out.println("Неверный запрос!");
        }


    }
}

@FunctionalInterface
interface Filterable {
    boolean filter(Web domain);
}