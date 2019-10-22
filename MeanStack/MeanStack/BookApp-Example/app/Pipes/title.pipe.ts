import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'title'
})
export class TitlePipe implements PipeTransform {
  transform(value: any[], args: string) : any {
    //value will the allBooks, args will be search criteria. this function returns the subset of the data....
    if(args == "")
      return value;
    var subset = value.filter(bk =>bk.title.includes(args));
    return subset;  
  }
}
