# Async

`@EnableAsync` detects Spring's @Async annotation. It has 2 limitations:

- it must be applied to public methods only
- self-invocation – calling the async method from within the same class – won't work
