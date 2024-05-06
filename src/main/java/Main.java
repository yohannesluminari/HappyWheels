import it.epicodeGruppo2.Abbonamento;
import it.epicodeGruppo2.AbbonamentoEnum;
import it.epicodeGruppo2.Tessera;
import it.epicodeGruppo2.User;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        User user = new User();
        user.setIdUser(1L);
        user.setNome("Mario");
        user.setCognome("Rossi");
        user.setDataNascita(new Date());

        System.out.println(user);


    }

}
