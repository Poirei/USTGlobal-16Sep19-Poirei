import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component ({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})


export class HomeComponent {
    news;
    constructor(private http: HttpClient) {
        // tslint:disable-next-line: no-unused-expression
        this.getNews;
    }
    getNews() {
        // tslint:disable-next-line: max-line-length
        this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=google-news-in&apiKey=a3127d2ec6d6424f854b0d52c32089a9').subscribe(data => {
            this.news = data.articles;
        }, err => {
            console.log(err);
        }, () => {
            console.log('News got successfully!');
        });
    }
}
