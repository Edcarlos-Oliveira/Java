
package edcarlosoliveira.idiomasistema;

import java.util.Locale;


public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O Idioma do Sistema é:");
        System.out.println(loc.getDisplayLanguage());
    }
}
