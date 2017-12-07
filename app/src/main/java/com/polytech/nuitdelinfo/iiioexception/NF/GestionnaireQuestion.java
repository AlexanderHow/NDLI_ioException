package com.polytech.nuitdelinfo.iiioexception.NF;

import com.polytech.nuitdelinfo.iiioexception.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Howard Alexandre on 16/03/2017.
 */

public class GestionnaireQuestion {
    private ArrayList<Question> Cmpt1Serie1=new ArrayList<Question>();
    private ArrayList<Question> Cmpt1Serie2=new ArrayList<Question>();
    private ArrayList<Question> Cmpt1Serie3=new ArrayList<Question>();
    private ArrayList<Question> Cmpt2Serie1=new ArrayList<Question>();
    private ArrayList<Question> Cmpt2Serie2=new ArrayList<Question>();
    private ArrayList<Question> Cmpt2Serie3=new ArrayList<Question>();

    //Hash map pour garder la reponse donné pour chaque question fausse
    private HashMap<Question, Reponse> erreurs = new HashMap<Question, Reponse>();

    //Singleton
    private static GestionnaireQuestion gestionnaireQuestion = new GestionnaireQuestion();

    private GestionnaireQuestion(){
        this.construireSeriesQuestion();
    }

    /*
    * Function made by Tua Mathieu and Munier Rémy
     */
    private void construireSeriesQuestion(){
        //construction de nos exercices c'est long...
        Reponse reponse1_1_1 = new Reponse("Hello","Hello est la manière la plus simple de dire 'Bonjour'.");
        this.Cmpt1Serie1.add(new Question("Que dis tu quand tu rencontres quelqu'un?", reponse1_1_1));

        Reponse reponse1_1_2 = new Reponse("My name is","Tout simplement 'Mon nom est'.");
        this.Cmpt1Serie1.add(new Question("Pour donner ton nom tu dis?", reponse1_1_2));

        Reponse reponse1_1_3 = new Reponse("I am 10 years old","En anglais on utilise le verbe être pour l'age.");
        this.Cmpt1Serie1.add(new Question("Pour donner ton age tu dis?", reponse1_1_3));

        Reponse reponse1_1_4 = new Reponse("I was born in","Tu utilises le passé 'was' car cet événement a déjà eu lieu.");
        this.Cmpt1Serie1.add(new Question("Pour dire où tu es né tu dis?", reponse1_1_4));

        Reponse reponse1_1_5 = new Reponse("Nice to meet you","'Nice to meet you' signifie 'Heureux de te rencontrer'.");
        this.Cmpt1Serie1.add(new Question("Comment dis tu 'Heureux de te rencontrer?'", reponse1_1_5));

        Reponse reponse1_1_6 = new Reponse("I am 130cm","Tu utilises le verbe être pour donner ta taille.");
        this.Cmpt1Serie1.add(new Question("Pour donner ta taille?", reponse1_1_6));

        Reponse reponse1_1_7 = new Reponse("I am playing an instrument","Tu utilises la forme be + ing pour parler de tes hobbies.");
        this.Cmpt1Serie1.add(new Question("Pour dire que tu joues d'un instrument tu dis?", reponse1_1_7));

        Reponse reponse1_1_8 = new Reponse("I live in","Pour parler d'un lieu on utilise 'in'.");
        this.Cmpt1Serie1.add(new Question("Comment tu dis où tu habites?", reponse1_1_8));

        Reponse reponse1_1_9 = new Reponse("I have one brother, and two sisters","'Have' signifie avoir. N'oublies pas le 's' à 'sisters'.");
        this.Cmpt1Serie1.add(new Question("Comment dis tu que tu as un frère et deux soeurs?", reponse1_1_9));

        Reponse reponse1_1_10 = new Reponse("Bye","'Bye' est une façon simple de dire au revoir.");
        this.Cmpt1Serie1.add(new Question("Comment dis tu au revoir?", reponse1_1_10));

        Reponse reponse1_2_1 = new Reponse("Ton age","'How old are you?' signifie 'Quel age as tu?'.");
        this.Cmpt1Serie2.add(new Question("'How old are you?' Te demandes", reponse1_2_1));

        Reponse reponse1_2_2 = new Reponse("Où tu te situes","'Where are you?' signifie 'Où es tu?'.");
        this.Cmpt1Serie2.add(new Question("'Where are you?' Te demandes", reponse1_2_2));

        Reponse reponse1_2_3 = new Reponse("Comment tu vas","'How are you?' signifie 'Comment vas tu?'.");
        this.Cmpt1Serie2.add(new Question("'How are you?' Te demandes", reponse1_2_3));

        Reponse reponse1_2_4 = new Reponse("Combien","'How many?' signifie 'Combien?'.");
        this.Cmpt1Serie2.add(new Question("'How many?' Te demandes", reponse1_2_4));

        Reponse reponse1_2_5 = new Reponse("Quel est l'heure","'What time is it?' signifie 'Quelle heure est-il?'.");
        this.Cmpt1Serie2.add(new Question("'What time is it?' Te demandes", reponse1_2_5));

        Reponse reponse1_2_6 = new Reponse("Que fais tu","'What are you doing?' signifie 'Que fais tu?'.");
        this.Cmpt1Serie2.add(new Question("'What are you doing?' Te demandes", reponse1_2_6));

        Reponse reponse1_2_7 = new Reponse("La couleur du ciel","'What colour is the sky?' signifie 'De quelle couleur est le ciel?'");
        this.Cmpt1Serie2.add(new Question("'What colour is the sky?' Te demandes", reponse1_2_7));

        Reponse reponse1_2_8 = new Reponse("L'endroit où tu vis","'Where do you live ?' signifie 'Où vie tu?'.");
        this.Cmpt1Serie2.add(new Question("'Where do you live?' Te demandes", reponse1_2_8));

        Reponse reponse1_2_9 = new Reponse("A tu un frère","'Do you have a brother?' signifie 'As tu un frère?'.");
        this.Cmpt1Serie2.add(new Question("'Do you have a brother?' Te demandes", reponse1_2_9));

        Reponse reponse1_2_10 = new Reponse("Quel est le nom de ta mère","'What is the name of your mom?' signifie 'Quel est le nom de ta mère?'");
        this.Cmpt1Serie2.add(new Question("'What is the name of your mom?' Te demandes", reponse1_2_10));

        Reponse reponse1_3_1 = new Reponse("What time is it?","'What time is it?' signifie 'Quel heure est il?'.");
        this.Cmpt1Serie3.add(new Question("Comment demandes tu l'heure?", reponse1_3_1));

        Reponse reponse1_3_2 = new Reponse("What's the weather like?","'What's the weather like?' signifie 'Comment est le temps?'.");
        this.Cmpt1Serie3.add(new Question("'Comment demandes tu le temps qu'il fait?' Te demandes", reponse1_3_2));

        Reponse reponse1_3_3 = new Reponse("Can I go to the bathroom?","'Il existe plusieurs mots pour remplacer Can est rendre la formulation plus polie mais Can est la plus simple.");
        this.Cmpt1Serie3.add(new Question("'Comment demandes tu d'aller aux toilettes?", reponse1_3_3));

        Reponse reponse1_3_4 = new Reponse("How much?","Attention de pas confondre many (non quantifiable) et much (quantifiable).");
        this.Cmpt1Serie3.add(new Question("'Comment demandes tu un prix?", reponse1_3_4));

        Reponse reponse1_3_5 = new Reponse("What time is it?","'What time is it?' signifie 'Quelle heure est-il?'.");
        this.Cmpt1Serie3.add(new Question("'Comment demandes tu l'heure?' Te demandes", reponse1_3_5));

        Reponse reponse1_3_6 = new Reponse("How old are you?","'How old are you?' signifie 'Quel age as tu?'.");
        this.Cmpt1Serie3.add(new Question("'Comment demandes tu l'age de quelqu'un?", reponse1_3_6));

        Reponse reponse1_3_7 = new Reponse("How tall are you?","'How tall are you?' signifie 'Quelle taille fai tu?'.");
        this.Cmpt1Serie3.add(new Question("Comment demandes tu la taille de quelqu'un?", reponse1_3_7));

        Reponse reponse1_3_8 = new Reponse("What's your name?","'What's your name?' signifie 'Quel est ton nom?'.");
        this.Cmpt1Serie3.add(new Question("Comment demandes tu le nom de quelqu'un?", reponse1_3_8));

        Reponse reponse1_3_9 = new Reponse("Do you have a brother?","'Do you have a brother?' signifie 'As tu un frère?'.");
        this.Cmpt1Serie3.add(new Question("Comment demandes tu à quelqu'un s'il a un frère?", reponse1_3_9));

        Reponse reponse1_3_10 = new Reponse("Where do you come from?","Attention n'oublie pas le From sinon la phrase est fausse.");
        this.Cmpt1Serie3.add(new Question("Comment demandes tu à quelqu'un d'où il vient?", reponse1_3_10));

        Reponse reponse2_1_1 = new Reponse("Peindre","Paint signifie Peindre");
        this.Cmpt2Serie1.add(new Question("Que veux dire Paint", reponse2_1_1));

        Reponse reponse2_1_2 = new Reponse("Café","Coffee signifie Café");
        this.Cmpt2Serie1.add(new Question("Que veux dire Coffee", reponse2_1_2));

        Reponse reponse2_1_3 = new Reponse("École","School signifie École");
        this.Cmpt2Serie1.add(new Question("Que veux dire School", reponse2_1_3));

        Reponse reponse2_1_4 = new Reponse("Fenêtre","Window signifie Fenêtre");
        this.Cmpt2Serie1.add(new Question("Que veux dire Window", reponse2_1_4));

        Reponse reponse2_1_5 = new Reponse("Zéro","Zero signifie Zéro");
        this.Cmpt2Serie1.add(new Question("Que veux dire Zero", reponse2_1_5));

        Reponse reponse2_1_6 = new Reponse("Sac à dos","Backpack signifie Sac à dos");
        this.Cmpt2Serie1.add(new Question("Que veux dire Backpack", reponse2_1_6));

        Reponse reponse2_1_7 = new Reponse("Poule","Chicken signifie Poule");
        this.Cmpt2Serie1.add(new Question("Que veux dire Chicken", reponse2_1_7));

        Reponse reponse2_1_8 = new Reponse("Chaussure","Shoe signifie Chaussure");
        this.Cmpt2Serie1.add(new Question("Que veux dire Shoe", reponse2_1_8));

        Reponse reponse2_1_9 = new Reponse("Feuilles","Leaf signifie Feuilles");
        this.Cmpt2Serie1.add(new Question("Que veux dire Leaf", reponse2_1_9));

        Reponse reponse2_1_10 = new Reponse("Main","'Hand' signifie 'Main'.");
        this.Cmpt2Serie1.add(new Question("Que veux dire Hand?", reponse2_1_10));

        Reponse reponse2_2_1 = new Reponse("Je ne pense pas","'I don't think so' signifie 'Je ne sais pas'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'I don't think so'?", reponse2_2_1));

        Reponse reponse2_2_2 = new Reponse("Attends une minute","'Wait a minute?' signifie 'Attends une minute'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'Wait  a minute'?", reponse2_2_2));

        Reponse reponse2_2_3 = new Reponse("Excusez moi","'I apologise' signifie 'Excusez moi'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'I apologise'?", reponse2_2_3));

        Reponse reponse2_2_4 = new Reponse("Je suis malade","'I am sick' signifie 'Je suis malade'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'I am sick'?", reponse2_2_4));

        Reponse reponse2_2_5 = new Reponse("Ne t'en fais pas","'Don't worry' signifie 'Ne t'en fais pas'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'Don't worry'?", reponse2_2_5));

        Reponse reponse2_2_6 = new Reponse("Au fait","'By the way' signifie 'Au fait'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'By the way'?", reponse2_2_6));

        Reponse reponse2_2_7 = new Reponse("Amuses toi bien","'Have fun' signifie 'Amuses toi bien'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'Have fun'?", reponse2_2_7));

        Reponse reponse2_2_8 = new Reponse("Tu me manques","'I miss you' signifie 'Tu me manques'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'I miss you'?", reponse2_2_8));

        Reponse reponse2_2_9 = new Reponse("Pouvez vous répeter?","'Can you repeat please?' signifie 'Pouvez répeter?'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'Can you repeat please?'?", reponse2_2_9));

        Reponse reponse2_2_10 = new Reponse("Allons y","'Let's go' signifie 'Allons y'.");
        this.Cmpt2Serie2.add(new Question("Que veux dire 'Let's go'", reponse2_2_10));

        Reponse reponse2_3_1 = new Reponse("I don't think so","'I don't think so' signifie 'Je ne sais pas'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Je ne pense pas'?", reponse2_3_1));

        Reponse reponse2_3_2 = new Reponse("Wait a minute","'Wait a minute' signifie 'Attends une minute'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Attends une minute'?", reponse2_3_2));

        Reponse reponse2_3_3 = new Reponse("I apologise","'I apologise' signifie 'Excusez moi'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Excusez moi'?", reponse2_3_3));

        Reponse reponse2_3_4 = new Reponse("I am sick","'I am sick' signifie 'Je suis malade'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Je suis malade'?", reponse2_3_4));

        Reponse reponse2_3_5 = new Reponse("Don't worry","'Don't worry' signifie 'Ne t'en fais pas'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Ne t'en fais pas'?", reponse2_3_5));

        Reponse reponse2_3_6 = new Reponse("By the way","'By the way' signifie 'Au fait'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Au fait'?", reponse2_3_6));

        Reponse reponse2_3_7 = new Reponse("Have fun","'Have fun' signifie 'Amuses toi bien'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Amuses toi bien'?", reponse2_3_7));

        Reponse reponse2_3_8 = new Reponse("I miss you","'I miss you' signifie 'Tu me manques'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Tu me manques'?", reponse2_3_8));

        Reponse reponse2_3_9 = new Reponse("Can you repeat please?","'Can you repeat please?' signifie 'Pouvez répeter?'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Pouvez vous répeter?'?", reponse2_3_9));

        Reponse reponse2_3_10 = new Reponse("Let's go","'Let's go' signifie 'Allons y'.");
        this.Cmpt2Serie3.add(new Question("Comment dire 'Allons y'", reponse2_3_10));
    }



    public static GestionnaireQuestion getInstance(){
        return gestionnaireQuestion;
    }

    public ArrayList<Question> getSerieQuestion(String cmpt, String serie){
        if(cmpt.equals("competence1")){
            switch (serie){
                case "serie1":
                    return this.Cmpt1Serie1;
                case "serie2":
                    return  this.Cmpt1Serie2;
                case "serie3":
                    return  this.Cmpt1Serie3;
                default:
                    return new ArrayList<Question>();
            }
        }
        else if(cmpt.equals("competence2")){
            switch (serie){
                case "serie1":
                    return this.Cmpt2Serie1;
                case "serie2":
                    return  this.Cmpt2Serie2;
                case "serie3":
                    return  this.Cmpt2Serie3;
                default:
                    return new ArrayList<Question>();
            }
        }
        else{
            return new ArrayList<Question>();
        }
    }

    public HashMap<Question, Reponse> getErreurs(){
        return this.erreurs;
    }

    public void addErreurs(Question q, Reponse r){
        this.erreurs.put(q,r);
    }

    public void resetErreurs(){
        this.erreurs=new HashMap<Question, Reponse>();
    }
}
