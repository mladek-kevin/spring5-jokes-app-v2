package com.example.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetJokeServiceImpl implements GetJokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public GetJokeServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getRandomQuote() {
    return this.chuckNorrisQuotes.getRandomQuote();
  }
}


