package cursodevsyonet.desafio03.exercicio02;

public class ElevadorImpl implements Elevador{

    private Integer andarAtual;
    private Integer totalAndares;
    private Integer capacidadeTotal;
    private Integer totalNoElevador;

    public ElevadorImpl() {
        this.andarAtual = 0;
        this.totalNoElevador = 0;
    }

    @Override
    public void inicializa(Integer capacidade, Integer totalAndaresPredio) {
        capacidadeTotal = capacidade;
        totalAndares = totalAndaresPredio;
        System.out.println("Iniciando elevador\n\n" +toString());

    }

    @Override
    public void entra() {
        /**
         * Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
         */

        if(totalNoElevador < capacidadeTotal) {
            totalNoElevador ++;
            System.out.println("Pode Entrar\n\n" + toString());
            return;
        }
        System.out.println("Capacidade máxima, espere o próximo!\n\n" +toString());

    }

    @Override
    public void sai() {
        /**
         * Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
         */
        if(totalNoElevador > 0) {
            totalNoElevador --;
            System.out.println("Saindo do elevador!\n\n" + toString());
            return;
        }

        System.out.println("Ninguém para sair!\n\n" + toString());
    }

    @Override
    public void sobe() {
        /**
         *  Sobe : para subir um andar (não deve subir se já estiver no último andar);
         */
        if(andarAtual < totalAndares) {
            andarAtual ++;
            System.out.println("Subindo!\n\n" + toString());
            return;
        }
        System.out.println("Último andar!\n\n" + toString());
    }

    @Override
    public void desce() {
        /**
         * Desce : para descer um andar (não deve descer se já estiver no térreo);
         */

        if(andarAtual > 0) {
            andarAtual --;
            System.out.println("Descendo...\n\n" + toString());
            return;
        }
        System.out.println("Terreo!!!\n\n" +toString());

    }

    public String toString() {
        return
                          "Andar atual: " + getAndarAtual() + "\n"
                        + "Capacidade total: " + getCapacidadeTotal() + "\n"
                        + "Total de pessoas no elevador: " + getTotalNoElevador() + "\n";



    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(Integer totalAndares) {
        this.totalAndares = totalAndares;
    }

    public Integer getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(Integer capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public Integer getTotalNoElevador() {
        return totalNoElevador;
    }

    public void setTotalNoElevador(Integer totalNoElevador) {
        this.totalNoElevador = totalNoElevador;
    }



}
