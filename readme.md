Java 9 modules - example
======

We have a Client module which uses Service module and requires Entity module as well.
In its turn Service module uses Repository module

The crucial point of this example refers to service discovery and ServiceLoader
as we export interface but to work we need an implementation which is from 'impl' package
and therefore not exported
