A code example to access a URL, consume some JSON returned from the endpoint, and display it.
Clicking on an item opens a second screen where more detail is shown. 
This code uses libraries like I would use in a production enviroment.
* ButterKnife
* Dagger 2
* Retrofit 2
* RxJava
* RxAndroid
* Picasso

I also implemented UI testing using Espresso, testing the two activies and the transition between them. 
1. Tested the main screen list is correctly showing the film title, this tests the View is correctly showing the Model.
2. Tested that clicking a film title opens the details screen to the correct film, this tests that the RecyclerView items click listener is correctly sending the film through.
3. Tested that the details screen shows the correct details, again checking that the View is correctly showing the Model.
