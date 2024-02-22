/*
 * EE422C Final Project submission by
 * Benjamin Smidt
 * brs2933
 * Summer 2023
 */
package com.benjaminsmidt.server.Auction; 
import java.util.ArrayList;

public class Auction {
    private ArrayList<AuctionItem> auctionItems; 
    private double auctionDurationSeconds; 

    public Auction() { 
        this.auctionDurationSeconds = 60 * 5; // 5 minutes
        this.auctionItems = new ArrayList<AuctionItem>(); 
    }

    public void addItem(AuctionItem item) { 
        auctionItems.add(item); 
    }

    public String toString() { 
        String string = "Auction\n" + "-------\n"; 
        for (AuctionItem item: auctionItems) { 
            string = string + item.toString(); 
        }
        return string; 
    }
}
