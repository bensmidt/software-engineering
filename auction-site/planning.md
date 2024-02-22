# Objects

## Server: ??
### Attributes
- customers: Customers[]
    - customers logged into the platform
### Behaviors

## Auction
### Attributes
- auctionBeginTime: float
    - time the Auction began
- auctionItems: AuctionItem[]
    - the items available to bid on in the Auction
- auctionDuration: float
    - length of time of the auction
- auctionHistory: AuctionHistory
### Behaviors
- 

## AuctionItem
### Attributes
- startBidPrice: float
    - minimum acceptable price to begin bidding
- highBid: Bid
    - highest bid for the auction item

- description: string
    - description of the auction item
- buyNowPrice: float
    - the price at which the item can be purchased immediately
- beginTime: float
    - time the auction began
- bidDuration: float
    - amount of time users have to bid on an item


### Behaviors
- isValidBid(): boolean
- timeLeftToBid(): float
- highBid(): float
- isClosed(): bool
- getDescription(): string
- getMinSellPrice(): float
- isSold(): boolean

## Bid
### Attributes
- auctionItem: AuctionItem
    - the auction item the bid was placed for
- customer: Customer
    - customer who placed the bid
- price: float
    - bid price 
- validated: boolean
    - whether the bid was valid for the auction item or not
### Behaviors
- isWinningBid(): boolean
- 

## History
### Attributes
- bids: Bid[]
### Behaviors
- 

## AuctionHistory

## CustomerHistory


## Customer
### Attributes
- isGuest: boolean
- username: string
- password: string
- customerHistory: CustomerHistory
### Behaviors

25 Extra Points: 
1 Set a minimum starting price > 0 for every item.
1 Set the duration for the auction for each item separately. 
1 Set a high limit that is a 'Buy It Now' price.  When a customer bids that amount, he/she gets it right away.  
2 Every customer can see the bid history of every item, including, perhaps, who made the bid.  If the item has been sold, every customer should be able to see the buyer and the selling price.
1 Items could have descriptions that are visible to customers
2 A search feature to search through items, customers, etc.
2 Non-volatile history of auctions, customer activity etc.
1 Sound
2 Count-down clocks for items.
3 Using the Observable class and Observer interface.
4 Use a cloud server to host the auction Server.
4 Cryptography techniques -- encryption of passwords, password hashing and salting, encryption of messages.
4 Use Apache Derby or other database.

NOT DOING
5 Nice GUI in general.

