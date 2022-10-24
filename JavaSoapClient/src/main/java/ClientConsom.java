import proxy.BanqueService;
import proxy.BanqueWs;

public class ClientConsom {
    public static void main(String[] args) {
        BanqueService bs=new BanqueWs().getBanqueServicePort();

        System.out.println(bs.getCompte(1).getSolde());

        


    }
}
