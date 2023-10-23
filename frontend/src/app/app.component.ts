import { Component, OnInit } from '@angular/core';
import { Car } from './types';


@Component({
    selector: 'app-root',
    styleUrls: ['./app.component.css'],
    templateUrl: './app.component.html',})
export class AppComponent implements OnInit {

    title: string = 'frontend';
    testString: string = "another app property";
    testAnotherString: string = "one more props";
    render: boolean = true;

    testList: string[] = ["string 1", "string 2", "string 3", "string 4"];

    renderData: boolean = false;
    testData: Car[] = [];

    ngOnInit(): void {
        return;}

    setRender(): void {
        this.render = !this.render;
        return;}

    async getData(): Promise<void> {

        console.log("fetching data");

        try {
            const response: Response = await fetch(

                // request url
                "http://localhost:9000/api/cars", {

                // request headers
                method: "GET",
                mode: "cors",
                headers: {"Content-Type": "application/json"},});

            console.log(response);

            const data: Car[] = await response.json();

            console.log(data);

            this.testData = data;
            this.renderData = true;}

        catch (error) {
            console.log(error);}

        // let time: Date = new Date();
        // this.testData = ["data 1", "data 2", `${time.getUTCHours()}:${time.getMinutes()}:${time.getSeconds()}:${time.getMilliseconds()}`];
        // this.renderData = true;

        return;}}
