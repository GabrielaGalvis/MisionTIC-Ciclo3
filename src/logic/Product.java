package logic;

public class Product {





        private String idProduct;
        private String description;
        private double value ;
        private int cant;
        private byte stockMin;
        private TypeProduct typeProduct;

        public Product(String idProduct, String description, double value, int cant, byte stockMin, TypeProduct typeProduct) {
            this.idProduct = idProduct;
            this.description = description;
            this.value = value;
            this.cant = cant;
            this.stockMin = stockMin;
            this.typeProduct = typeProduct;
        }

        public String getIdProduct() {
            return idProduct;
        }

        public void setIdProduct(String idProduct) {
            this.idProduct = idProduct;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public int getCant() {
            return cant;
        }


        private void setCant(int cant) {
            this.cant = cant;
        }

        public byte getStockMin() {
            return stockMin;
        }

        public void setStockMin(byte stockMin) {
            this.stockMin = stockMin;
        }

        public TypeProduct getTypeProduct() {
            return typeProduct;
        }

        public void setTypeProduct(TypeProduct typeProduct) {
            this.typeProduct = typeProduct;
        }

        public double getIVA(){

            switch (typeProduct){

                case VIVERES: return getValue()*0.12;

                case LICORES: return getValue()*0.19;

                case MEDICAMENTOS: return getValue() * 0.16;
            }
            return 0.0;

        }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                ", cant=" + cant +
                ", stockMin=" + stockMin +
                ", typeProduct=" + typeProduct +
                '}';
    }
}
