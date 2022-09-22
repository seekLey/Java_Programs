public interface Interface_Program {

    interface PaperCheck {
        void firstYear();
        void secondYear();
        void thirdYear();
        void fourthYear();
    }

    class pillaiCollege implements PaperCheck {

        @Override
        public void firstYear() {
            System.out.println("First year papers will be checked by Mumbai University");
        }

        @Override
        public void secondYear() {
            System.out.println("College will do");
        }

        @Override
        public void thirdYear() {
            System.out.println("College will do");
        }

        @Override
        public void fourthYear() {
            System.out.println("Last year papers will be checked by Mumbai University");
        }
    }

    class College extends pillaiCollege {

        public static void main(String[] args) {

            pillaiCollege pc = new College();
            pc.firstYear();
            pc.secondYear();
            pc.thirdYear();
            pc.fourthYear();
        }
    }

}
