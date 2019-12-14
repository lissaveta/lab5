package lab5;

public class tarelka extends dish.dish {
        private String razmer;
        public String getRazmer() {
            return razmer;
        }
        public void setRazmer(String razmer) {
            this.razmer = razmer;
        }
        public tarelka(String material, String color, String razmer) {
            super(material, color);
            this.razmer = razmer;
        }
        @Override
        public String toString() {
            return "Тарелка {" +
                    "Размер: " + razmer +
                    ", Материал: " + material +
                    ", Цвет: " + color +
                    '}';
        }
}
