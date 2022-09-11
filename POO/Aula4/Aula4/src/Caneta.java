class Caneta {
    private String  modelo;
    private String  cor;
    private float   ponta;
    private int     carga;
    private boolean tampada;

    public int getCarga() {
        return carga;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    public float getPonta() {
        return ponta;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
        public void tampar() {
            this.tampada = true;
        }
        public void destampar() {
            this.tampada = false;
        }
        
        public void cargaCaneta (int c) {
            this.carga = c;
        }
        public void status() {
            System.out.println("Modelo:  " + this.modelo);
            System.out.println("Cor:     " + this.cor);
            System.out.println("Ponta:   " + this.ponta);
            System.out.println("Carga:   " + this.carga);
            System.out.println("Tampada: " + this.tampada);
        }
}
