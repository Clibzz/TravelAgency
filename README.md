# Bolt

The company BOLT is a company that makes it possible to request a car via an App and to drive to a destination. Based on the number of kilometers and the type of car, an amount is calculated that the customer has to pay.

Bolt only uses Toyota and Volvo cars. All cars have a driver.

This driver always has a first name, if no first name is given or only spaces, the driver will be given a default name “BoltDriver”.

The cars have a brand and a Dutch license plate (format: 999-XX-9, three numbers, two capital letters and another number). If the numbers on the license plate do not meet the requirements, -1 will appear in the license plate instead of the numbers. If the letters do not match, this will be null. Make it so that lowercase letters are also accepted.

There are three different types of cars that can be reserved. An ordinary car, it has a price of 50 cents per kilometer. An electric car has a price of 25 cents per kilometer and a diesel car for which not only a price of 63 cents per kilometer applies, but also an environmental surcharge of 3 euros per 10 kilometers. The journeys are billed per kilometre.

Bolt would like the following things:

* The amount to be paid per trip;
* The total revenue of all cars;
* The average distance of all cars;
* The longest distance ride (If there are more longest rides, return the most recent);
* The driver with the most turnover (If there are more with the same turnover, it doesn't matter which one is returned).
