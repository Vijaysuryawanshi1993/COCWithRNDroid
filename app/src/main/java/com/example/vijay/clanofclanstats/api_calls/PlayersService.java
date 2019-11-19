package com.example.vijay.clanofclanstats.api_calls;

import com.example.vijay.clanofclanstats.webcal_response_demo.PlayerDetailResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by v.jadhav on 25-09-2017.
 */

public interface PlayersService {
    @GET("players/%238ylyjl8qy")
    Call<PlayerDetailResponse> getPlayers();
}
