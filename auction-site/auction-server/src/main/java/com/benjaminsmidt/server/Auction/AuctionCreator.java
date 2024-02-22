/*
 * EE422C Final Project submission by
 * Benjamin Smidt
 * brs2933
 * Summer 2023
 */
package com.benjaminsmidt.server.Auction; 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class AuctionCreator {

    private Scanner in; 

    public Auction createAuction() throws FileNotFoundException{ 

        File auctionInfoFile = new File("InitAuction.txt"); 
        in = new Scanner(auctionInfoFile); 

        Auction auction = new Auction(); 
        while (in.hasNext()) { 
            try { 
                AuctionItem item = readAuctionItem(); 
                auction.addItem(item); 
            } catch (ReadAuctionFileException e) { 
                e.printStackTrace(); 
                in.close(); 
                break; 
            }
        }
        System.out.println(auction.toString()); 
        in.close(); 

        return auction; 
    }

    private AuctionItem readAuctionItem() { 

        String name = readString(); 
        Double startBidPrice = readDouble(); 
        String description = readString(); 
        
        return new AuctionItem(name, description, startBidPrice); 
    }

    private Double readDouble() { 
        if (!in.hasNextDouble()) { 
            throw new ReadAuctionFileException("Next object must be a double");
        }
        return in.nextDouble(); 
    }

    private String readString() { 

        String str = readWord(); 
        if (str.startsWith("\"") == false) { 
            throw new ReadAuctionFileException("String must begin with a \"");
        }
        str = str.substring(1); 
        while (str.endsWith("\"") == false) { 
                str = str + " " + readWord(); 
        }
        str = str.substring(0, str.length()-1); 
        return str; 
    }

    private String readWord() { 
        if (!in.hasNext()) { 
            throw new ReadAuctionFileException("Unexpectedly reached the end of the file"); 
        }
        return in.next(); 
    }

}
