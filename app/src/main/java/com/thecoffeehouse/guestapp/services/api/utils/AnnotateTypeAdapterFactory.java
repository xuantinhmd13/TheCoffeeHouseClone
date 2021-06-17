package com.thecoffeehouse.guestapp.services.api.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnnotateTypeAdapterFactory implements TypeAdapterFactory {
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.google.gson.reflect.TypeToken<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final Class<T> rawType = typeToken.getRawType();
        final Set set = (Set) Stream.of((Object[]) rawType.getDeclaredFields()).filter($$Lambda$AnnotateTypeAdapterFactory$cAqaXVwxvsJZlen6bzbInyJsdJ8.INSTANCE).collect(Collectors.toSet());
        if (set.isEmpty()) {
            return null;
        }
        final TypeAdapter<T> adapter = gson.getAdapter(rawType);
        return new TypeAdapter<T>() {
            /* class com.thecoffeehouse.guestapp.services.api.utils.AnnotateTypeAdapterFactory.AnonymousClass1 */

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t) throws IOException {
                adapter.write(jsonWriter, t);
            }

            @Override // com.google.gson.TypeAdapter
            public T read(JsonReader jsonReader) {
                JsonElement parse = Streams.parse(jsonReader);
                if (parse.isJsonObject()) {
                    ArrayList arrayList = new ArrayList();
                    for (Field field : set) {
                        if (!parse.getAsJsonObject().has(field.getName())) {
                            arrayList.add(field.getName());
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        throw new JsonParseException(String.format("Missing required fields %s for %s", arrayList, rawType.getName()));
                    }
                }
                return (T) gson.getDelegateAdapter(AnnotateTypeAdapterFactory.this, typeToken).fromJsonTree(parse);
            }
        };
    }

    static /* synthetic */ boolean lambda$create$0(Field field) {
        return field.getAnnotation(JsonRequired.class) != null;
    }
}
