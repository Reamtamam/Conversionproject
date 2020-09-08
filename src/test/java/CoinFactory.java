public class CoinFactory {
    public static COIN getCoinInstance(EnumCoins coin) {
     return switch (coin){
         case ILS -> new ILS();
         case USD -> new USD();
     };

     }
}


