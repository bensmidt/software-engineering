/*
 * EE422C Final Project submission by
 * Benjamin Smidt
 * brs2933
 * Summer 2023
 */
package com.benjaminsmidt.server.Auction; 
import java.io.FileNotFoundException;

public class AuctionCreatorTester {
    
    public static void main(String args[]) { 
        AuctionCreator auctionCreator = new AuctionCreator(); 
        try { 
            auctionCreator.createAuction(); 
        }
        catch (FileNotFoundException e) { 
            e.printStackTrace(); 
        }
    }
}
