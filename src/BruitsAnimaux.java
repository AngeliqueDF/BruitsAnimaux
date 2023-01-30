public class BruitsAnimaux {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Chat chat2 = new Chat();
        Chien chien = new Chien();
        Chien chien2 = new Chien();
        Lapin lapin = new Lapin();
        PeutCrier[] animaux = {chien, chat,chien2, chat2};
        // Chaque instanciation de classe qui implémente faireCri() appelle cette méthode.
        // La classe lapin n'appelle pas cette méthode, l'inclure dans le tableau provoquerait une exception.
        for (int i = 0; i < animaux.length; i++) {
            animaux[i].faireCri();
        }
    }
}