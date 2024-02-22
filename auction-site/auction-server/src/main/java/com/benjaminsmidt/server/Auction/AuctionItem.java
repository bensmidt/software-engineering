/*
 * EE422C Final Project submission by
 * Benjamin Smidt
 * brs2933
 * Summer 2023
 */
package com.benjaminsmidt.server.Auction; 

public class AuctionItem {

    private String name; 
    private String description; 
    private double startBidPrice; 
    private double curBidPrice; 

    public AuctionItem(String name, String description, double startBidPrice) { 
        this.name = name; 
        this.description = description; 
        this.startBidPrice = startBidPrice; 
        this.curBidPrice = -1; 
    }

    public String toString() { 
        String string = "Name: " + name + "\n"; 
        string = string + "Description: " + description + "\n"; 
        string = string + "Starting Bid Price: " + startBidPrice + "\n"; 
        string = string + "Current Bid Price: " + curBidPrice + "\n\n"; 
        return string; 
    }

}
