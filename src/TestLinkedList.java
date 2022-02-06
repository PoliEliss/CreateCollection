import java.util.Objects;

public class TestLinkedList {

    private int size = 0;

    private Element first; // это получается самый первый элемент

    private Element nextElement; // это след элемент за первым

    private Element lastElement;// это последний элемент

    // private int element; //  Как правильно задать поле, которое будет принимать значение заданное пользователем, и потом ведь наверное уже через метод add назначать ссылки на предыдущие и next Елемент

    public TestLinkedList() {
    }



    // Получается, что  примерно должно быть что-то такое...
    // Если мы в TestLinkedList передаем значение ( пусть int) и это первый элемент в коллекции, то
    // nextElement должен быть null и предыдущий null, ведь всего 1 элемент. А когда я добавлю второй:
    // У второго элемента ( предыдщий элемент:1элемент ; значение самого второго элемента; nextElement Null)
    // И в этот момент у первого элемента должна появиться ссылка на next ведь появился второй элемент...но как это сделать

    private class Element { // объект  в LimkedList содержит информацию о текущем элементе, ссылку на предыдущий и следующий. Поэтому решила сделать вложенный класс
        // чтобы таким образом обозначить все поля

        Element previousElement; // предыдущий элемент
        int currentElement;  // текущей элемент

        Element nextElement; //  след. элемент // тут int не может быть я же потом Null его не сделаю в методе add

        public Element getPreviousElement() {
            return previousElement;
        }

        public void setPreviousElement(Element previousElement) {
            this.previousElement = previousElement;
        }

        public int getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(int currentElement) {
            this.currentElement = currentElement;
        }

        public Element getNextElement() {
            return nextElement;
        }

        public void setNextElement(Element nextElement) {
            this.nextElement = nextElement;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "previousElement=" + previousElement +
                    ", currentElement=" + currentElement +
                    ", nextElement=" + nextElement +
                    '}';
        }

        public Element(Element previousElement, int currentElement, Element nextElement) {
            this.previousElement = previousElement;
            this.currentElement = currentElement;
            this.nextElement = nextElement;
        }
    }

    @Override
    public String toString() {
        return "TestLinkedList{" +
                "size=" + size +
                ", first=" + first +
                ", nextElement=" + nextElement +
                '}';
    }

    public void addElement(int element) {

        if (size == 0) {
            first = new Element(null, element, null);
            size++;
        } else if (size > 0) {

            nextElement = new Element(first, element, null); // Вот тут вот фигня!! я всегда при создание след элемента буду обращаться к первому. И 3 и 4 элементы они будут образаться к первому. Как это переделать??






            // Element test = new Element(nextElement,element,null); // я думала, что таким образом перезапишу nextElement  и я буду еще получать информацию о текущем значние прошлого элемента
          //  System.out.println("jjjjj" + test.previousElement);
            size++;


            System.out.println(9);
        }

    }


}

class n {
    public static void main(String[] args) {
        TestLinkedList e = new TestLinkedList();

        e.addElement(122);
        System.out.println(e);

        e.addElement(678);
        System.out.println(e);
        e.addElement(900);
        System.out.println(e);
        e.addElement(8);
        System.out.println(e);
    }
}









