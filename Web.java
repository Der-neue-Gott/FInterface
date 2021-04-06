public class Web {

    private Domain domain;
    private Country country;
    private int price;
    private int storage;


    public Web(Domain domain, Country country, int price, int storage) {
        this.domain = domain;
        this.country = country;
        this.price = price;
        this.storage = storage;
    }


    public Domain getDomain() {
        return domain;
    }
        public void setDomain(Domain domain) {
            this.domain = domain;
        }

    public Country getCountry() {
        return country;
    }
        public void setCountry(Country country) {
            this.country = country;
        }

    public int getPrice() {
        return price;
    }
        public void setPrice(int price) {
            this.price = price;
        }

    public int getStorage() {
        return storage;
    }
        public void setStorage(int storage) {
            this.storage = storage;
        }


    @Override
    public String toString() {
        return "\t \t \t Домен " + domain + " принадлежит стране: " + country + ". Доступная память сервера: " + storage +
                " ГБ. Стоимость: $" + price;
    }

}