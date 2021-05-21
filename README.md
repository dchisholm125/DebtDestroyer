# DebtDestroyer

This project was initially started on 4/11/2021. This project will be developed in Java to run on the command line, currently. My goal is to have a usable Android App that connects to a Windows desktop app so the user can use it cross-platform, and then maybe refactor it to other operating systems and smartphone app stores.

The purpose of this project is to take a user's many debts (up to a maximum of 16 because who has more than 16 credit cards, loans, or financial obligations?!) and to do three things for them:

1. Display them in the proper order of how they should pay them off (which no matter how large a debt is, you are being charged the most per dollar on your highest interest rate debt)
2. Take a user's alotted extra principal per month and to display how it will affect their entire debt profile in terms of interest savings monthly, yearly, and over the lifetime of committing to 'x' amount of extra principal.
3. Take a lump sum from the user and show them how the additional funds will flow through and effect their bottom line monthly, yearly, and over the lifetime of their debts.
4. The final piece will be to ask the question: "if I want to pay off ALL of my debts by 'x' date, what monthly payment will get me there?"

I'm happy to say that I've come up with the proper tests to make it happen! Using a binary search type of logic, I test a minimum (the current monthly payment) and a maximum (the entire balance of their debts) and use an O(log n) function that adds both numbers and divides by 2. This halves the possible answers with each iteration and arrives at the correct answer. The only other way to do this was to develop a mathematic equation, which I don't have the know-how to do, so testing was a better way.

# What I'm working on now

The back-end is nearly finished, and now my plan is to utilize JavaFX for the front-end display. I have a roadmap on how it will be presented, but am still just toying with the layout/look for now. I have to finalize the easier algorithms and optimize them now that the "payoff by 'x' date" function is complete.

# What I'm looking for

Constructive feedback! I am an advanced beginner, but always looking to improve my system design, readability, and optimization for runtime and space management. Ideas are welcome as well, but I don't anticipate anyone actually finding my project anyway, so this is more just or the fun of it and future employers.

Thanks everyone, I hope my project is helpful to users someday, and would love to collaborate on projects if you do find you need some Java/C# help on something you're building as well. I could use the practice!!
