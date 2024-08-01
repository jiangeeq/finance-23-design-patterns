package org.example.c05_constructor;

public class TradeRequest {
    private String orderId;
    private String accountNumber;
    private String symbol;
    private int quantity;
    private double price;
    private String orderType;
    private String timeInForce;

    // 私有构造函数，防止直接实例化
    private TradeRequest() {}

    @Override
    public String toString() {
        return "TradeRequest{" +
                "orderId='" + orderId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", orderType='" + orderType + '\'' +
                ", timeInForce='" + timeInForce + '\'' +
                ", identityHashCode='" + identityHashCode() + '\'' +
                '}';
    }

    public String identityHashCode(){
        // System.identityHashCode() 返回对象的哈希码，这个哈希码通常与对象的内存地址有关。虽然它不是内存地址，但在调试和日志记录时，它可以作为对象的一个唯一标识符。
        int hashCode = System.identityHashCode(this);
        return this.getClass().getName()+"@"+hashCode;
    }

    // 静态内部类Builder
    public static class Builder {
        private String orderId;
        private String accountNumber;
        private String symbol;
        private int quantity;
        private double price;
        private String orderType;
        private String timeInForce;

        public Builder() {
            System.out.println("使用静态内部类Builder");
        }

        public Builder withOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder withAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder withQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        public Builder withTimeInForce(String timeInForce) {
            this.timeInForce = timeInForce;
            return this;
        }

        /**
         * 对象地址
         * @return
         */
        public String identityHashCode(){
            // System.identityHashCode() 返回对象的哈希码，这个哈希码通常与对象的内存地址有关。虽然它不是内存地址，但在调试和日志记录时，它可以作为对象的一个唯一标识符。
            int hashCode = System.identityHashCode(this);
            return this.getClass().getName()+"@"+hashCode;
        }


        public TradeRequest build() {
            TradeRequest tradeRequest = new TradeRequest();
            tradeRequest.orderId = this.orderId;
            tradeRequest.accountNumber = this.accountNumber;
            tradeRequest.symbol = this.symbol;
            tradeRequest.quantity = this.quantity;
            tradeRequest.price = this.price;
            tradeRequest.orderType = this.orderType;
            tradeRequest.timeInForce = this.timeInForce;
            System.out.println("build()中操作了2个对象"+tradeRequest.identityHashCode()+"   "+this.identityHashCode());
            return tradeRequest;
        }
    }
}

