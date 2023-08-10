package com.example.amanscode.jacksondemo.main;

import com.example.amanscode.jacksondemo.pojo.Transaction;
import com.example.amanscode.jacksondemo.pojo.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WalletManager {
    public static void main(String[] args) {
        List<User> users = createUsers();
        List<Transaction> transactions = createTransactions();
        String inputFileName = "/Users/agupta1/Documents/ACV/intellij_workspace/Git/MavenDemo/src/main/resources/inputFileForWallets.json";
        String outputFileName = "/Users/agupta1/Documents/ACV/intellij_workspace/Git/MavenDemo/src/main/resources/outputFileForWallets.json";

        writeJson(outputFileName, users, transactions);
        readJson(inputFileName);

    }

    public static List<Transaction> readJson(String inputFileName){
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Transaction> transactions = mapper.readValue(new File(inputFileName), List.class);
            for(int i = 0 ; i < transactions.size() ; i++) {
                System.out.println(transactions.get(i));
            }
            return transactions;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String writeJson(String outputFileName, List<User> users, List<Transaction> transactions){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(outputFileName), transactions);
            String jsonString = mapper.writeValueAsString(transactions);
            System.out.println(jsonString);
            String jsonPrettyString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(transactions);
            System.out.println(jsonPrettyString);
            return jsonPrettyString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<User> createUsers(){
        List<User> users = new ArrayList<User>();
        User u1 = new User("1", "Ross", 3000.0);
        User u2 = new User("2", "Joey", 1000.0);
        User u3 = new User("3", "Chandler", 2000.0);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        return users;
    }

    private static List<Transaction> createTransactions(){
        List<Transaction> transactions = new ArrayList<Transaction>();
        Transaction t1 = new Transaction("10", "1", 120.2, "credit", "99.0.1.1", "2023-08-16 08:12:23");
        Transaction t2 = new Transaction("11", "3", 621.79, "debit", "99.0.1.1", "2023-08-01 11:53:23");
        Transaction t3 = new Transaction("12", "3", 700.67, "credit", "99.0.1.1", "2023-08-03 09:12:23");
        Transaction t4 = new Transaction("13", "1", 342.15, "credit", "99.0.1.1", "2023-08-16 08:12:23");
        Transaction t5 = new Transaction("14", "1", 467.73, "debit", "99.0.1.1", "2023-08-16 08:12:23");
        Transaction t6 = new Transaction("15", "2", 20.0, "debit", "99.0.1.1", "2023-08-16 08:12:23");
        Transaction t7 = new Transaction("16", "3", 700.67, "credit", "99.0.1.1", "2023-08-16 08:12:23");
        Transaction t8 = new Transaction("17", "2", 400.57, "debit", "99.0.1.1", "2023-08-16 08:12:23");
        Transaction t9 = new Transaction("18", "1", 353.98, "credit", "99.0.1.1", "2023-08-16 08:12:23");
        Transaction t10 = new Transaction("19", "2", 98.75, "debit", "99.0.1.1", "2023-08-16 08:12:23");
        transactions.add(t1);
        transactions.add(t2);
        transactions.add(t3);
        transactions.add(t4);
        transactions.add(t5);
        transactions.add(t6);
        transactions.add(t7);
        transactions.add(t8);
        transactions.add(t9);
        transactions.add(t10);
        return transactions;
    }
}
