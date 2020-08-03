# TestBed
@angular/core/testing/TestBed
Dependency Injection (DI)
TestBed helps us to set up the dependencies for our tests. We call
TestBed.configureTestingModule passing our configuration.


# ComponentFixture
@angular/core/testing/ComponentFixture
We used TestBed.createComponent to create an instance of our component. The component
instance will be accessible within a fixture.

https://github.com/angular/angular/blob/a7e9bc97f6a19a2b47b962bd021cb91346a44baa/modules/angular2/src/testing/test_component_builder.ts#L31


# async
@angular/core/testing/async
We can use async when dependencies involve asynchronous handling. This will
internally create a zone and deal with any asynchronous processing.
