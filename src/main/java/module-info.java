module dev.mccue.guava.graph {
    requires static com.google.errorprone.annotations;
    requires static dev.mccue.jsr305;
    requires static org.checkerframework.checker.qual;

    requires transitive dev.mccue.guava.base;
    requires transitive dev.mccue.guava.collect;
    requires dev.mccue.guava.primitives;
    requires dev.mccue.guava.math;

    exports dev.mccue.guava.graph;
}