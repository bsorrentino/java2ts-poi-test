import {
  Stream,
  StreamSupport,
  Iterable,
} from "excel-types";


export function streamFromIterator<T>( ii:java.util.Iterator<T>) {
  let it = new Iterable( () => ii );
  return StreamSupport.stream(it.spliterator(), false);
}
