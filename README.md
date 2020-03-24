# Async

`@EnableAsync` detects Spring's @Async annotation. It has 2 limitations:

- it must be applied to public methods only
- self-invocation – calling the async method from within the same class – won't work

By default, Spring uses a SimpleAsyncTaskExecutor to actually run these methods asynchronously. 
The defaults can be overridden at two levels:
- the application level 
- the individual method level.