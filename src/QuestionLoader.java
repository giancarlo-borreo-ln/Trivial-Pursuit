public class QuestionLoader {
    public static void loadQuestions(QuestionBank questionBank){
        questionBank.addQuestion(new Question("Qual'è il tipo primitvo per numeri interi in Java?", "int", JavaTopic.VARIABLES));
        questionBank.addQuestion(new Question("Quale parola chiave si usa per dichiarare una stringa in Java", "String", JavaTopic.VARIABLES));
        questionBank.addQuestion(new Question("Qual'è il tipo di ritorno di un metodo che non produce valore?","Void",JavaTopic.METHODS));
        questionBank.addQuestion(new Question("Quale costrutto viene utilizzata per i loop infiniti?","while",JavaTopic.LOOPS));
        questionBank.addQuestion(new Question("Quale ciclo viene usato almeno una volta se la condizione è falsa?", "Do-While", JavaTopic.LOOPS));
        questionBank.addQuestion(new Question("Che tipo di errore può essere generato durante l'esecuzione di un programma ", "RuntimeException", JavaTopic.EXCEPTIONS));

        // VARIABLES
        questionBank.addQuestion(new Question("Qual è il tipo primitivo usato per valori true/false?", "boolean", JavaTopic.VARIABLES));
        questionBank.addQuestion(new Question("Qual è il tipo per numeri decimali a singola precisione?", "float", JavaTopic.VARIABLES));
        questionBank.addQuestion(new Question("Come si chiama il tipo primitivo per caratteri singoli?", "char", JavaTopic.VARIABLES));
        questionBank.addQuestion(new Question("Quale parola chiave si usa per dichiarare una costante?", "final", JavaTopic.VARIABLES));
        questionBank.addQuestion(new Question("Qual è il valore predefinito di un int non inizializzato?", "0", JavaTopic.VARIABLES));
        questionBank.addQuestion(new Question("Quale simbolo si usa per assegnare un valore a una variabile?", "=", JavaTopic.VARIABLES));

        // LOOPS
        questionBank.addQuestion(new Question("Come si chiama il ciclo che si usa quando conosci già quante volte iterare?", "for", JavaTopic.LOOPS));
        questionBank.addQuestion(new Question("Qual è il ciclo che controlla la condizione all'inizio?", "while", JavaTopic.LOOPS));
        questionBank.addQuestion(new Question("Quale ciclo esegue sempre almeno una volta?", "do-while", JavaTopic.LOOPS));
        questionBank.addQuestion(new Question("Quale parola chiave interrompe un ciclo?", "break", JavaTopic.LOOPS));
        questionBank.addQuestion(new Question("Quale parola chiave salta alla prossima iterazione?", "continue", JavaTopic.LOOPS));
        questionBank.addQuestion(new Question("Come si chiama il ciclo migliorato per scorrere array e liste?", "for-each", JavaTopic.LOOPS));

        // CONDITIONALS
        questionBank.addQuestion(new Question("Qual è l'operatore logico 'OR' in Java?", "||", JavaTopic.CONDITIONALS));
        questionBank.addQuestion(new Question("Qual è l'operatore logico 'AND' in Java?", "&&", JavaTopic.CONDITIONALS));
        questionBank.addQuestion(new Question("Qual è l'operatore di negazione logica?", "!", JavaTopic.CONDITIONALS));
        questionBank.addQuestion(new Question("Qual è l'operatore ternario in Java?", "?", JavaTopic.CONDITIONALS));
        questionBank.addQuestion(new Question("Quale parola chiave rappresenta un'alternativa all'if?", "else", JavaTopic.CONDITIONALS));
        questionBank.addQuestion(new Question("Quale struttura si usa per confrontare più valori interi?", "switch", JavaTopic.CONDITIONALS));

        // ARRAYS
        questionBank.addQuestion(new Question("Come si accede al primo elemento di un array chiamato arr?", "arr[0]", JavaTopic.ARRAY));
        questionBank.addQuestion(new Question("Come si accede all'ultimo elemento di un array arr?", "arr[arr.length - 1]", JavaTopic.ARRAY));
        questionBank.addQuestion(new Question("Quale proprietà contiene la lunghezza di un array?", "length", JavaTopic.ARRAY));
        questionBank.addQuestion(new Question("Come si crea un array di 10 interi?", "int[] arr = new int[10];", JavaTopic.ARRAY));
        questionBank.addQuestion(new Question("Quale eccezione viene lanciata quando superi i limiti dell'array?", "ArrayIndexOutOfBoundsException", JavaTopic.ARRAY));
        questionBank.addQuestion(new Question("Gli array in Java possono contenere tipi primitivi?", "Sì", JavaTopic.ARRAY));

        // METHODS
        questionBank.addQuestion(new Question("Come si chiama il metodo che viene eseguito all'avvio di un programma Java?", "main", JavaTopic.METHODS));
        questionBank.addQuestion(new Question("Quale parola chiave definisce un metodo che non restituisce valore?", "void", JavaTopic.METHODS));
        questionBank.addQuestion(new Question("Come si chiama un metodo con lo stesso nome della classe?", "costruttore", JavaTopic.METHODS));
        questionBank.addQuestion(new Question("I metodi possono avere parametri?", "Sì", JavaTopic.METHODS));
        questionBank.addQuestion(new Question("Quale parola chiave si usa per definire metodi che non possono essere modificati?", "final", JavaTopic.METHODS));
        questionBank.addQuestion(new Question("Quale è la visibilità di default di un metodo?", "package-private", JavaTopic.METHODS));

        // CLASSES
        questionBank.addQuestion(new Question("Quale parola chiave viene usata per definire una classe?", "class", JavaTopic.CLASSES));
        questionBank.addQuestion(new Question("Come si chiama la pratica di incapsulare dati e metodi insieme?", "incapsulamento", JavaTopic.CLASSES));
        questionBank.addQuestion(new Question("Quale visibilità rende un membro accessibile ovunque?", "public", JavaTopic.CLASSES));
        questionBank.addQuestion(new Question("Come si chiama una classe dentro un'altra classe?", "nested", JavaTopic.CLASSES));
        questionBank.addQuestion(new Question("Quale parola chiave si usa per creare un oggetto?", "new", JavaTopic.CLASSES));
        questionBank.addQuestion(new Question("Tutti i metodi devono essere definiti dentro una classe?", "Sì", JavaTopic.CLASSES));

        // INHERITANCE
        questionBank.addQuestion(new Question("Quale parola chiave viene usata per estendere una classe?", "extends", JavaTopic.INHERITANCE));
        questionBank.addQuestion(new Question("Quale parola chiave si usa per accedere ai membri della superclasse?", "super", JavaTopic.INHERITANCE));
        questionBank.addQuestion(new Question("Come si chiama il concetto di avere più classi che ereditano la stessa superclasse?", "ereditarietà", JavaTopic.INHERITANCE));
        questionBank.addQuestion(new Question("Qual è la parola chiave per impedire che una classe venga estesa?", "final", JavaTopic.INHERITANCE));
        questionBank.addQuestion(new Question("Tutte le classi in Java ereditano implicitamente da quale classe?", "Object", JavaTopic.INHERITANCE));
        questionBank.addQuestion(new Question("Qual è il termine per ridefinire un metodo della superclasse?", "override", JavaTopic.INHERITANCE));

        // EXCEPTIONS
        questionBank.addQuestion(new Question("Quale blocco viene usato per catturare un'eccezione?", "catch", JavaTopic.EXCEPTIONS));
        questionBank.addQuestion(new Question("Quale parola chiave viene usata per generare un'eccezione?", "throw", JavaTopic.EXCEPTIONS));
        questionBank.addQuestion(new Question("Come si chiama la clausola per specificare che un metodo può sollevare un'eccezione?", "throws", JavaTopic.EXCEPTIONS));
        questionBank.addQuestion(new Question("Qual è la superclasse di tutte le eccezioni?", "Exception", JavaTopic.EXCEPTIONS));
        questionBank.addQuestion(new Question("Qual è il blocco che viene eseguito sempre, con o senza eccezione?", "finally", JavaTopic.EXCEPTIONS));
        questionBank.addQuestion(new Question("Come si chiama l'eccezione per divisione per zero?", "ArithmeticException", JavaTopic.EXCEPTIONS));

        questionBank.addQuestion(new Question("Quale parola chiave viene usata per creare una sottoclasse in java", "Extends", JavaTopic.INHERITANCE));

    }
}
