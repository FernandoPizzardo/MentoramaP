package um;

public class Carro {



    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusos;
    private String cor;
    private Integer portasDoCarro;
    private Integer anoDeFabricacao;
    private Double combustivel;
    private Boolean ArCondicionado;

    public Double getCombustivel() {
        return combustivel;
    }



    public Boolean getArCondicionado() {
        return ArCondicionado;
    }

    public Integer getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public Integer getPortasDoCarro() {
        return portasDoCarro;
    }

    public String getCor() {
        return cor;
    }

    public Integer getQuantidadePneus(){
        return quantidadePneus + 1;
    }

    public Integer getQuantidadeParafusos() {
        return quantidadeParafusos;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }


    public void setQuantidadeParafusos() {
        quantidadeParafusos = quantidadePneus * 4;
        this.quantidadeParafusos = quantidadeParafusos;
    }
    public void setPortasDoCarro() {
        portasDoCarro = quantidadePneus;
        this.portasDoCarro = portasDoCarro;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setQuantidadeCalotas(){
        quantidadeCalotas = quantidadePneus;
        this.quantidadeCalotas = quantidadeCalotas;

    }
    public void setAnoDeFabricacao(Integer anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    public void setArCondicionado(Boolean arCondicionado) {
        this.ArCondicionado = arCondicionado;
    }
    public void setCombustivel(Double combustivel) {
        this.combustivel = combustivel;
    }

    public Carro(int quantidadePneus){
        setQuantidadePneus(4);
        setQuantidadeCalotas();
        setQuantidadeParafusos();
        setPortasDoCarro();
        setAnoDeFabricacao(2015);
        setCombustivel(40.5);
        setArCondicionado(false);

    }
    public void imprimeValores() {
        System.out.println("Quantidade de pneus em um carro é " + getQuantidadePneus());
        System.out.println("Quantidade de parafusos é " + getQuantidadeParafusos());
        System.out.println("Quantiade de calotas é " + getQuantidadeCalotas());
        System.out.println("Quantidade de portas é "  + getPortasDoCarro ());
        System.out.println("O ano de fabricação é " + getAnoDeFabricacao());
        System.out.println("O tanque comporta: " + getCombustivel());
    }

}
