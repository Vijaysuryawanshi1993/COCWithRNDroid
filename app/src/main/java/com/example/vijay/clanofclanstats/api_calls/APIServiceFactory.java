package com.example.vijay.clanofclanstats.api_calls;

import android.content.Context;

import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class APIServiceFactory {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
            .readTimeout(180, TimeUnit.SECONDS)
            .connectTimeout(4, TimeUnit.MINUTES)
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    String AuthValue = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjI0ZDUyMTYwLTUxM2EtNDM5MS1iOWQ5LTg1YjAxMTJhMDljNyIsImlhdCI6MTUwNjQwNzU2NSwic3ViIjoiZGV2ZWxvcGVyLzg5ZjJkYjkyLTc0ZDYtZDI5ZC04YWRlLTQ5YzUzMjllYWMxZSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjIxOS45MS4yMzEuMTI0Il0sInR5cGUiOiJjbGllbnQifV19.2E7hpuH3CEHejlZg6Rw5ABOB_QVoWbqADwQQFkF9w1OkIlIKt_R31S68Llto-BTqNybSJYKdJOD_SH-G1PYw6g";
                    Request request = chain.request().newBuilder().addHeader("Authorization", AuthValue).build();
                    return chain.proceed(request);
                }
            });

    private static Retrofit.Builder builder = new Retrofit
            .Builder()
            .baseUrl("https://api.clashofclans.com/v1/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create());
    static Retrofit retrofit = builder.build();

    public static <S> S createService(Class<S> serviceClass, final Context context) {
        OkHttpClient client = httpClient.build();


        Retrofit retrofit = builder.client(client).addConverterFactory(
                GsonConverterFactory.create(new GsonBuilder()
                        .serializeNulls()
                        .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
                        .create())).build();
        return retrofit.create(serviceClass);
    }
}