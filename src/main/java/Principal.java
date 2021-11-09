import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Arquivo a = new Arquivo();

        ArrayList<Funcionario> funcs = new ArrayList<>();

        for (String f : a.ler()) {
            int id = Integer.parseInt(f.split(",")[0]);
            String estadoCivil = f.split(",")[1];
            String grau = f.split(",")[2];
            int filhos = Integer.parseInt(f.split(",")[3]);
            double salario = Double.parseDouble(f.split(",")[4]);
            Funcionario aux = new Funcionario(id,estadoCivil,grau,filhos,salario);
            funcs.add(aux);
        }

        for(Funcionario func : funcs){
            if(func.filhos != 0){
                a.escrever(func);
            }
        }
    }
}
