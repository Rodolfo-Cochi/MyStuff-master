package Code;
public class Continua {
    public static boolean continua(int i,String senha) {
        if(i < senha.length()){
            return true;
        }else{
            return false;
        }
    }
}