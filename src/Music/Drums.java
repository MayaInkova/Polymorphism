package Music;

public class Drums  extends Instrument {
    void play() {
        System.out.println("Playing the drums");
    }

    public class Main {
        public static void main(String[] args) {
            Instrument[] orchestra = {new Piano(), new Guitar(), new Drums()};

            for (Instrument instrument : orchestra) {
                instrument.play();  // Извиква съответния метод play() за всеки обект
            }
        }
    }
}
