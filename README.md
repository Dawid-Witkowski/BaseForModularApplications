# BaseForModularApplications

Thought about adding this to help the future advanced learners

Why should you use modules and not packages?:

- Reusability of modules 
- Strict visibility control (prevents coupling)
- Scalability (Even finding files is easier with modules, especially if you create the project with the feature-module approach in mind (just bear in mind that this project was set up for the very beginners, so it uses "one module per layer", which is still better than using packages, BUT you probably won't see this in any production code))
- Build time (By a lot!)
- Testability

and many more...

This can be used for a base / example for any kind of android app (if this will be the first time you create an app with modules, I encourage you to create some basic app with retrofit, it's fun)

This project has [ktlint](https://ktlint.github.io/) already set up, just use ```./gradlew ktlintCheck``` to check it out :)
