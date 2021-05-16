1. [Dependency Management Plugin for sbt](#dependency-management-plugin-for-sbt)
2. [How to use](#how-to-use)
3. [Why I needed this?](#why-i-needed-this)
4. [Advantages?](#advantages)
5. [Disadvantages?](#disadvantages)

# Dependency Management Plugin for sbt
A Plugin to manage dependencies in case your project has lot of modules and it becomes difficult to track and manage the
dependencies.
In case of Maven, we have parent pom which can be used for dependency management. <dependencyManagement> attribute.

## How to use
- This is just a structure depicting how you can have the dependency management system in an sbt plugin.
- Each project becomes a plugin. e.g. FirstProject, SecondProject in this DependencyMgmtPlugin.
- You can have traits to define common dependencies and your modules can extend those traits to use those dependencies.
- e.g. LoggingDependencies is defined as trait and SecondProject extends that trait to have logging dependencies inherited.

## Why I needed this?
- In one of my projects, we had Event Driven System and hence 40+ microservices.
- At times, it became very difficult to manage the dependencies.
- Also, it was challenging to have the dependencies always updated.
- In our team, the process was to first check all the dependencies and update all of them to latest.
- But it's not recommended [IMO] practice.

## Advantages?
- This can give an advantage of managing dependencies at single place.
- Also, the person who is making changes in common libraries, can also identify the targeted micro-services/modules 
and update dependencies in this plugin itself to have the changes reflected.
- No change in build.sbt of the target micro-service/module.
- The breaking changes can be managed using versioning in the DependencyMgmtPlugin itself.

## Disadvantages?
- In case of versioning, all 40+ modules will need changes in plugin.sbt to assure consistency across.
- Build may not fail unless the changes are breaking.
- Hence manual verification of code changes needed. e.g. In case of deprecated methods, you need to manually check whether
the library changes need to be incorporated in target module accordingly.