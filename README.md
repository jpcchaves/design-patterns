# Design Patterns by the Gang of Four (GOF)

## Introduction

This repository provides an in-depth look at the 23 design patterns defined by the "Gang of Four" (
GOF) in their seminal book *"Design Patterns: Elements of Reusable Object-Oriented Software"*. These
patterns are categorized into three groups: Creational, Structural, and Behavioral patterns. Each
pattern is implemented in a programming language and comes with explanations and examples.

## Table of Contents

1. [Creational Patterns](#creational-patterns)
    - [Abstract Factory](#abstract-factory)
    - [Builder](#builder)
    - [Factory Method](#factory-method)
    - [Prototype](#prototype)
    - [Singleton](#singleton)
2. [Structural Patterns](#structural-patterns)
    - [Adapter](#adapter)
    - [Bridge](#bridge)
    - [Composite](#composite)
    - [Decorator](#decorator)
    - [Facade](#facade)
    - [Flyweight](#flyweight)
    - [Proxy](#proxy)
3. [Behavioral Patterns](#behavioral-patterns)
    - [Chain of Responsibility](#chain-of-responsibility)
    - [Command](#command)
    - [Interpreter](#interpreter)
    - [Iterator](#iterator)
    - [Mediator](#mediator)
    - [Memento](#memento)
    - [Observer](#observer)
    - [State](#state)
    - [Strategy](#strategy)
    - [Template Method](#template-method)
    - [Visitor](#visitor)
4. [Usage](#usage)
5. [Contributing](#contributing)
6. [License](#license)

## Creational Patterns

### Abstract Factory

- **Definition:** Provides an interface for creating families of related or dependent objects
  without specifying their concrete classes.

### Builder

- **Definition:** Separates the construction of a complex object from its representation, allowing
  the same construction process to create various representations.

### Factory Method

- **Definition:** Defines an interface for creating an object but allows subclasses to alter the
  type of objects that will be created.

### Prototype

- **Definition:** Specifies the kinds of objects to create using a prototypical instance and creates
  new objects by copying this prototype.

### Singleton

- **Definition:** Ensures a class has only one instance and provides a global point of access to it.

## Structural Patterns

### Adapter

- **Definition:** Converts the interface of a class into another interface the clients expect.
  Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

### Bridge

- **Definition:** Decouples an abstraction from its implementation so that the two can vary
  independently.

### Composite

- **Definition:** Composes objects into tree structures to represent part-whole hierarchies.
  Composite lets clients treat individual objects and compositions of objects uniformly.

### Decorator

- **Definition:** Attaches additional responsibilities to an object dynamically. Decorators provide
  a flexible alternative to subclassing for extending functionality.

### Facade

- **Definition:** Provides a unified interface to a set of interfaces in a subsystem. Facade defines
  a higher-level interface that makes the subsystem easier to use.

### Flyweight

- **Definition:** Uses sharing to support large numbers of fine-grained objects efficiently.

### Proxy

- **Definition:** Provides a surrogate or placeholder for another object to control access to it.

## Behavioral Patterns

### Chain of Responsibility

- **Definition:** Avoids coupling the sender of a request to its receiver by giving more than one
  object a chance to handle the request. Chains the receiving objects and passes the request along
  the chain until an object handles it.

### Command

- **Definition:** Encapsulates a request as an object, thereby allowing for parameterization of
  clients with queues, requests, and operations.

### Interpreter

- **Definition:** Given a language, defines a representation for its grammar along with an
  interpreter that uses the representation to interpret sentences in the language.

### Iterator

- **Definition:** Provides a way to access the elements of an aggregate object sequentially without
  exposing its underlying representation.

### Mediator

- **Definition:** Defines an object that encapsulates how a set of objects interact. Mediator
  promotes loose coupling by keeping objects from referring to each other explicitly and lets you
  vary their interaction independently.

### Memento

- **Definition:** Without violating encapsulation, captures and externalizes an object's internal
  state so that the object can be restored to this state later.

### Observer

- **Definition:** Defines a one-to-many dependency between objects so that when one object changes
  state, all its dependents are notified and updated automatically.

### State

- **Definition:** Allows an object to alter its behavior when its internal state changes. The object
  will appear to change its class.

### Strategy

- **Definition:** Defines a family of algorithms, encapsulates each one, and makes them
  interchangeable. Strategy lets the algorithm vary independently from clients that use it.

### Template Method

- **Definition:** Defines the skeleton of an algorithm in an operation, deferring some steps to
  subclasses. Template Method lets subclasses redefine certain steps of an algorithm without
  changing the algorithm's structure.

### Visitor

- **Definition:** Represents an operation to be performed on the elements of an object structure.
  Visitor lets you define a new operation without changing the classes of the elements on which it
  operates.

## Usage

To use the design patterns in this repository, clone the repository and navigate to the pattern's
directory. Each pattern's directory contains a README.md file with instructions on how to run the
example code.

```bash
git clone https://github.com/yourusername/design-patterns-gof.git
cd design-patterns-gof
