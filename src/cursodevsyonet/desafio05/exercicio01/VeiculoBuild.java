package cursodevsyonet.desafio05.exercicio01;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class VeiculoBuild {


    static List<Veiculos> veiculosLista = new ArrayList<>();


    public void adicionaVeiculo(String marca, String modelo, String placa, String chassi, Double valor) {

        Veiculos veiculos = new Veiculos(marca, modelo, placa, chassi, valor);

        veiculosLista.add(veiculos);
    }

    public Boolean listaVeiculosMarca(String marca) {
        for (Veiculos veiculo : veiculosLista) {
            if (veiculo.getMarca().equals(marca))
                return true;
            System.out.println("Veiculos da marca " + marca + "\n" + veiculo);
        }
        return false;
    }

    public void listaModeloVeiculo(String modelo) {
        for (Veiculos veiculo : veiculosLista) {
            if (veiculo.getModelo().equals(modelo))
                System.out.println(veiculo);
        }
    }

    public static Boolean verificaSeExisteAlgumVeiculoDaMarca(List<Veiculos> veiculos){
        return veiculos.stream()
                .allMatch(veiculo -> "Vw"
                        .equals(veiculo.getMarca()));
    }
    public static Boolean verificaSeExisteAlgumVeiculoDaModelo(List<Veiculos> veiculos){
        return veiculos.stream()
                .allMatch(veiculo -> "Gol"
                        .equals(veiculo.getModelo()));
    }
    public static Boolean verificaVeiculoJetta(List<Veiculos> veiculos){
        return veiculos.stream()
                .allMatch(veiculo -> "Jetta"
                        .equals(veiculo.getModelo()));
    }



    public void somaValoresVeiculos() {

        Double somaTotal = 0.0;
        for (Veiculos veiculo : veiculosLista) {
            somaTotal = veiculo.getValor() + somaTotal;
        }
        System.out.println("A soma dos valores de todos os veículos é igual a R$" + somaTotal + "00 mil reais");
    }

    public void ajustaPlacaVeiculos(String placa) {
       /* for (Veiculos veiculo : veiculosLista) {
            veiculo.setPlaca(placa);
            System.out.println(veiculo);*/
        //veiculosLista.stream()
//                .peek(veiculos -> veiculos.setPlaca("ABC1234"))
//                .collect(Collectors.toList());
        veiculosLista.stream().forEach(veiculos -> {
            veiculos.setPlaca(placa);
            System.out.println(veiculos);
        });
        // }
    }

    public static List<Veiculos> listaDuplicada(List<Veiculos> veiculos) {
        return veiculos.stream()
                .flatMap(veiculo -> Stream.of(veiculo, veiculo))
                .collect(Collectors.toList());

    }


    public void listaPlacas() {
        for (Veiculos veiculo : veiculosLista) {
            System.out.println(veiculo.getPlaca());
        }
    }

    public void ordenaPrecoVeiculos() {
        Comparator<Veiculos> customComparator = new Comparator<Veiculos>() {
            @Override
            public int compare(Veiculos v1, Veiculos v2) {
                if (v1.getValor() > v2.getValor()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        veiculosLista.stream().sorted(customComparator).forEach(veiculos -> {
            System.out.println(veiculos.getValor());
        });
    }
}
