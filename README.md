# World
World is a practice project to explore TDD/BDD with Java and jUnit.

World is an experiment to create working virtual world mechanisms using behavior driven development and service oriented structure.  This is need-based development driven by an imaginary specification.  There is only enough implementation to cover "the need."

All objects in the implementation are separated into models (objects that hold data but have no behavior) and services (objects that have behavior but not state).  Each service object performs action(s) on model(s).  

All classes in the tests are either unit tests of the services or hand-rolled dependency mocks.

Next, I hope to flush out "the need", add a mocking framework like Mockito, and an inversion of control container like Spring.
