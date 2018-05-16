import {
  Stream,
  StreamSupport
} from "excel-types";

interface IterableStatic {
  new<T>( arg0:java.lang.Iterable<T> ):java.lang.Iterable<T>;
}

const Iterable:IterableStatic  = Java.type("java.lang.Iterable");


export function streamFromIterator<T>( ii:java.util.Iterator<T>) {
  let it = new Iterable( () => ii );
  return StreamSupport.stream(it.spliterator(), false);
}
